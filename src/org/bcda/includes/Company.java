package org.bcda.includes;

import javax.swing.JCheckBox;

/**
 * @author Dinneya Charles
 */
public class Company {

    String name;
    String string;
    float remark;

    public Company(String name) {
        this.name = name;
    }

    public String getCheckString(JCheckBox nr, JCheckBox check1) {
        StringBuilder string = new StringBuilder();
        if (nr.isSelected()) {
            string = new StringBuilder("  NR");
            this.remark += 4.5;
            return string.toString();
        } else {
            if (check1.isSelected()) {
                string.append("  √");
                this.remark += 4.5;
            } else {
                string.append("  X");
                this.remark += 0;
            }
        }
        
        return string.toString();
    }

    public String getCheckString(JCheckBox nr, JCheckBox check1, JCheckBox check2, JCheckBox check3) {
        StringBuilder string = new StringBuilder();

        if (nr.isSelected()) {
            string = new StringBuilder("  NR");
            this.remark += 13.5;
            return string.toString();
        } else {
            if (check1.isSelected()) {
                string.append("  √  ");
                this.remark += 4.5;
            } else {
                string.append("  X  ");
                this.remark += 0;
            }
            if (check2.isSelected()) {
                string.append("  √  ");
                this.remark += 4.5;
            } else {
                string.append("  X  ");
                this.remark += 0;
            }
            if (check3.isSelected()) {
                string.append("  √  ");
                this.remark += 4.5;
            } else {
                string.append("  X  ");
                this.remark += 0;
            }
        }
        return string.toString();
    }

    public String getCheckString(JCheckBox nr, JCheckBox check1, JCheckBox check2) {
        StringBuilder string = new StringBuilder();
        if (nr.isSelected()) {
            string = new StringBuilder("  NR");
            this.remark += 9.0;
            return string.toString();
        } else {
            if (check1.isSelected()) {
                string.append("  √  ");
                this.remark += 4.5;
            } else {
                string.append("  X  ");
                this.remark += 0;
            }
            if (check2.isSelected()) {
                string.append("  √  ");
                this.remark += 4.5;
            } else {
                string.append("  X  ");
                this.remark += 0;
            }
        }
        return string.toString();
    }

    @Override

    // Returns name of the Company
    public String toString() {
        return name;
    }

    public float getRemark() {
        return remark;
    }
}




