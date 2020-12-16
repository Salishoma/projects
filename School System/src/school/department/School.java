package school.department;

// This interface gives methods that should be implemented within the school system

public interface School {
    String admit(String name, int age, int level);

    boolean expel(String name, String admissionNumber);
}
