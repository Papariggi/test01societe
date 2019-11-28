package models;

import org.springframework.stereotype.Component;

/**
 * Class represents department entity.
 */
@Component("department")
public class Department {
    private int depId;

    private String depName;

    //for using HashSet
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null | obj.getClass() != obj.getClass())
            return false;

        Department dep = (Department) obj;

        return (this.depId == dep.getDepId());
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + Integer.hashCode(depId);
        hash = hash * 17 + depName.hashCode();
        return hash;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getDepId() {
        return depId;
    }

    public String getDepName() {
        return depName;
    }
}
