/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Local Variable Type Inference
*/

package cert.java11.question.set1.localvariableinti;

public class AClassWithAVeryLongName {
    String name;

    public AClassWithAVeryLongName() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "AClassWithAVeryLongName{" +
                "name='" + name + '\'' +
                '}';
    }
}