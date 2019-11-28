package models;

import org.springframework.stereotype.Component;

/**
 * Class represents employee entity.
 */
@Component("employee")
public class Employee {
    private int userId;
    private int managerId;
    private String fio;
    private Department userDepartment;


    public int getUserId() {
        return userId;
    }


    //for using HashSet
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null | obj.getClass() != obj.getClass())
            return false;

        Employee emp = (Employee) obj;
        return (this.userId == emp.getUserId());
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + Integer.hashCode(userId);
        hash = hash * 17 + Integer.hashCode(managerId);
        hash = hash * 17 + fio.hashCode();
        hash = hash * 17 + userDepartment.hashCode();
        return hash;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setUserDepartment(Department userDepartment) {
        this.userDepartment = userDepartment;
    }

    public int getManagerId() {
        return managerId;
    }

    public String getFio() {
        return fio;
    }

    public Department getUserDepartment() {
        return userDepartment;
    }
}
