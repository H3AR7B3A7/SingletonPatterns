package TemplatePattern;

public class TemplatePattern2 {
    public static void main(String[] args) {
        System.out.println("Computer science:");
        BasicEngineering course1 = new ComputerScience();
        course1.completeCourse();
        System.out.println("____");
        System.out.println("Electronics:");
        BasicEngineering course2 = new Electronics();
        course2.completeCourse();
    }
}

abstract class BasicEngineering {
    public final void completeCourse() {
        completeMath();
        completeSoftSkills();
        completeSpecialPaper();
        if (isAdditionalPapersNeeded()) {
            completeAdditionalPapers();
        }
    }

    private void completeMath() {
        System.out.println("1.Mathematics");
    }

    private void completeSoftSkills() {
        System.out.println("2.Soft Skills");
    }

    public abstract void completeSpecialPaper();

    private void completeAdditionalPapers() {
        System.out.println("4.Additional Papers are required for this course.");
    }

    boolean isAdditionalPapersNeeded() {
        return true;
    }
}

class ComputerScience extends BasicEngineering {
    @Override
    public void completeSpecialPaper() {
        System.out.println("3.Object-Oriented Programming");
    }
}

class Electronics extends BasicEngineering {
    @Override
    public void completeSpecialPaper() {
        System.out.println("3.Digital Logic and Circuit Theory");
    }

    @Override
    boolean isAdditionalPapersNeeded() {
        return false;
    }
}