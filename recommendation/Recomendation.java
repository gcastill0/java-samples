import java.util.Scanner;

public class Recomendation {

    // ----- Entry point -----
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, " + name +
                "! This program helps you pick materials/software to create your artwork.");

        int track = askMenu(sc,
                "Are you going to use digital or traditional?",
                "1 - Digital",
                "2 - Traditional");

        if (track == 1) {
            runDigitalFlow(sc);
        } else {
            runTraditionalFlow(sc);
        }

        sc.close();
    }

    // =========================
    // DIGITAL FLOW
    // =========================
    private static void runDigitalFlow(Scanner sc) {
        int typeOfWork = askMenu(sc,
                "What kind of artwork are you going to make?",
                "1 - Illustration",
                "2 - Animation",
                "3 - 3D Model");

        int usedBefore = askDigitalUsedBefore(sc, typeOfWork);

        // Only ask skill if they picked something valid (non-zero).
        int skill = 0;
        if (usedBefore != 0) {
            skill = askIntInRange(sc,
                    "Rate your skill level (1 low - 10 high) for the software you chose:",
                    1, 10);
        }

        int quality = askMenu(sc,
                "How important is high quality export/output?",
                "1 - Not important",
                "2 - Somewhat important",
                "3 - Very important");

        int storage = askMenu(sc,
                "How much storage do you have on your device? (in GB)",
                "1 - 1 - 10",
                "2 - 11 - 20",
                "3 - 21+");

        int budget = askMenu(sc,
                "How much are you willing to spend?",
                "1 - $0 - $25",
                "2 - $25 - $50",
                "3 - $50 - $75",
                "4 - $75 - $100");

        int avoid = askMenu(sc,
                "Is there any particular software you DO NOT want to use?",
                "0 - No preference",
                "1 - Photoshop",
                "2 - Procreate",
                "3 - Blender",
                "4 - Maya",
                "5 - Clip Studio Paint",
                "6 - Adobe Illustrator",
                "7 - Ibis Paint X",
                "8 - Procreate Dreams");

        String recommendation = recommendDigital(typeOfWork, usedBefore, skill, quality, storage, budget, avoid);
        System.out.println();
        System.out.println("Recommendation: " + recommendation);
    }

    private static int askDigitalUsedBefore(Scanner sc, int typeOfWork) {
        if (typeOfWork == 1) { // Illustration
            return askMenu(sc,
                    "What software have you used before (pick one)?",
                    "1 - Photoshop",
                    "2 - Adobe Illustrator",
                    "3 - Clip Studio Paint",
                    "4 - Procreate",
                    "5 - Ibis Paint X");
        } else if (typeOfWork == 2) { // Animation
            return askMenu(sc,
                    "What software have you used before (pick one)?",
                    "1 - Photoshop",
                    "2 - Procreate Dreams",
                    "3 - Blender",
                    "4 - Maya");
        } else { // 3D Model
            return askMenu(sc,
                    "What software have you used before (pick one)?",
                    "1 - Blender",
                    "2 - Maya");
        }
    }

    private static String recommendDigital(
            int typeOfWork,
            int usedBefore,
            int skill,
            int quality,
            int storage,
            int budget,
            int avoid
    ) {
        // This recommendation logic is intentionally simple.
        // Expand it by adding clearer rules over time.

        String skillBand = skillBand(skill); // "LOW", "MED", "HIGH" (or "NONE")

        // If user refuses a tool, don’t recommend it.
        // (avoid uses the 0..8 codes in the menu above)
        boolean avoidPhotoshop = (avoid == 1);
        boolean avoidProcreate = (avoid == 2);
        boolean avoidBlender = (avoid == 3);
        boolean avoidMaya = (avoid == 4);
        boolean avoidCSP = (avoid == 5);
        boolean avoidIllustrator = (avoid == 6);
        boolean avoidIbis = (avoid == 7);
        boolean avoidDreams = (avoid == 8);

        if (typeOfWork == 1) { // Illustration
            // Low budget + small storage: recommend lighter/cheaper options (from your list)
            if (budget == 1 && storage == 1) {
                if (!avoidIbis) return "Ibis Paint X (lightweight, low cost)";
                if (!avoidProcreate) return "Procreate (if you already own it)";
                return "Clip Studio Paint (check for sales)";
            }

            // If quality is very important, suggest stronger illustration tools
            if (quality == 3) {
                if (!avoidCSP) return "Clip Studio Paint (strong illustration workflow)";
                if (!avoidPhotoshop) return "Photoshop (high-quality output)";
                if (!avoidIllustrator) return "Adobe Illustrator (vector-based clarity)";
            }

            // Skill-based gentle suggestions
            if ("LOW".equals(skillBand)) {
                if (!avoidProcreate) return "Procreate (friendly learning curve)";
                return "Ibis Paint X (easy to start)";
            }

            // Default
            if (!avoidCSP) return "Clip Studio Paint";
            if (!avoidPhotoshop) return "Photoshop";
            return "Adobe Illustrator";
        }

        if (typeOfWork == 2) { // Animation
            if (budget == 1) {
                if (!avoidBlender) return "Blender (free, capable for animation)";
                if (!avoidDreams) return "Procreate Dreams (simple animation start)";
            }

            if (quality == 3 && "HIGH".equals(skillBand) && !avoidMaya) {
                return "Maya (industry-grade animation)";
            }

            if (!avoidBlender) return "Blender";
            if (!avoidDreams) return "Procreate Dreams";
            return "Photoshop (basic animation workflows)";
        }

        // 3D Model
        if (budget == 1 && !avoidBlender) return "Blender (free 3D modeling)";
        if (!avoidMaya && "HIGH".equals(skillBand)) return "Maya";
        if (!avoidBlender) return "Blender";
        return "Maya (if you can access it)";
    }

    // =========================
    // TRADITIONAL FLOW
    // =========================
    private static void runTraditionalFlow(Scanner sc) {
        int typeOfWork = askMenu(sc,
                "What kind of artwork are you going to make?",
                "1 - Painting",
                "2 - Drawing",
                "3 - Sculpture");

        int usedBefore = askTraditionalUsedBefore(sc, typeOfWork);

        int skill = 0;
        if (usedBefore != 0) {
            skill = askIntInRange(sc,
                    "Rate your skill level (1 low - 10 high) for the material you chose:",
                    1, 10);
        }

        int budget = askMenu(sc,
                "How much are you willing to spend on materials?",
                "1 - $0 - $25",
                "2 - $25 - $50",
                "3 - $50 - $75",
                "4 - $75 - $100");

        int avoid = askMenu(sc,
                "Is there any material you DO NOT want to use?",
                "0 - No preference",
                "1 - Acrylic",
                "2 - Watercolour",
                "3 - Oil paint",
                "4 - Graphite",
                "5 - Charcoal",
                "6 - Clay");

        String recommendation = recommendTraditional(typeOfWork, usedBefore, skill, budget, avoid);
        System.out.println();
        System.out.println("Recommendation: " + recommendation);
    }

    private static int askTraditionalUsedBefore(Scanner sc, int typeOfWork) {
        if (typeOfWork == 1) { // Painting
            return askMenu(sc,
                    "What material have you used before (pick one)?",
                    "1 - Acrylic",
                    "2 - Watercolour",
                    "3 - Oil paint");
        } else if (typeOfWork == 2) { // Drawing
            return askMenu(sc,
                    "What material have you used before (pick one)?",
                    "1 - Graphite (pencil)",
                    "2 - Charcoal",
                    "3 - Markers");
        } else { // Sculpture
            return askMenu(sc,
                    "What material have you used before (pick one)?",
                    "1 - Clay",
                    "2 - Cardboard + Paper");
        }
    }

    private static String recommendTraditional(int typeOfWork, int usedBefore, int skill, int budget, int avoid) {
        String band = skillBand(skill);

        boolean avoidAcrylic = (avoid == 1);
        boolean avoidWater = (avoid == 2);
        boolean avoidOil = (avoid == 3);
        boolean avoidGraphite = (avoid == 4);
        boolean avoidCharcoal = (avoid == 5);
        boolean avoidClay = (avoid == 6);

        if (typeOfWork == 1) { // Painting
            if (budget == 1) {
                if (!avoidWater) return "Watercolour (low setup cost)";
                if (!avoidAcrylic) return "Acrylic (budget-friendly, flexible)";
                return "Basic acrylic starter set (if possible)";
            }
            if ("LOW".equals(band)) {
                if (!avoidAcrylic) return "Acrylic (easy to control and forgiving)";
                return "Watercolour (practice control gradually)";
            }
            if ("HIGH".equals(band) && !avoidOil) return "Oil paint (advanced depth and blending)";
            if (!avoidAcrylic) return "Acrylic";
            return "Watercolour";
        }

        if (typeOfWork == 2) { // Drawing
            if (!avoidGraphite) return "Graphite (strong foundation and cheap)";
            if (!avoidCharcoal) return "Charcoal (great value contrast practice)";
            return "Markers (clean workflow, but can cost more)";
        }

        // Sculpture
        if (!avoidClay) return "Clay (best all-around for learning forms)";
        return "Cardboard + Paper (cheap prototyping for sculpture)";
    }

    // =========================
    // SMALL HELPERS (LEARNING GOLD)
    // =========================
    private static int askMenu(Scanner sc, String question, String... options) {
        System.out.println(question);
        for (String opt : options) {
            System.out.println(opt);
        }

        // NOTE: In a beginner project, minimal validation is fine.
        // You can later upgrade this to loop until valid input.
        return readInt(sc);
    }

    private static int askIntInRange(Scanner sc, String question, int min, int max) {
        System.out.println(question);
        int value = readInt(sc);

        while (value < min || value > max) {
            System.out.println("Please enter a number between " + min + " and " + max + ":");
            value = readInt(sc);
        }
        return value;
    }

    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next(); // discard invalid token
            System.out.println("Please enter a number:");
        }
        return sc.nextInt();
    }

    private static String skillBand(int skill) {
        if (skill <= 0) return "NONE";
        if (skill <= 3) return "LOW";
        if (skill <= 6) return "MED";
        return "HIGH";
    }
}
