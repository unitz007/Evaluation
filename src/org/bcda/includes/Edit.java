/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bcda.includes;

import javax.swing.JCheckBox;

/**
 *
 * @author Dinneya Charles
 */
public class Edit {

    public Edit(String string, JCheckBox nr, JCheckBox check) {
        if (string.equals("  NR")) {
            nr.setSelected(true);
            check.setSelected(false);
            check.setEnabled(false);
        } else if (string.equals("  √")) {
            check.setSelected(true);
            nr.setSelected(false);
            nr.setEnabled(false);
        } else {
            check.setSelected(false);
            nr.setSelected(false);
        }
    }

    public Edit(String string, JCheckBox nr, JCheckBox check1, JCheckBox check2) {
        if (string.equals("  NR")) {
            nr.setSelected(true);
            check1.setSelected(false);
            check2.setSelected(false);
            check1.setEnabled(false);
            check2.setEnabled(false);
        } else if (string.equals("  √    √  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(true);
            check2.setSelected(true);
        } else if (string.equals("  √    X  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(true);
            check2.setSelected(false);
        } else if (string.equals("  X    √  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(false);
            check2.setSelected(true);
        } else {
            nr.setSelected(false);
            check1.setSelected(false);
            check2.setSelected(false);
        }
    }

    public Edit(String string, JCheckBox nr, JCheckBox check1, JCheckBox check2, JCheckBox check3) {
        if (string.equals("  NR")) {
            nr.setSelected(true);
            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
        } else if (string.equals("  √    √    √  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(true);
            check2.setSelected(true);
            check3.setSelected(true);
        } else if (string.equals("  X    √    √  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(false);
            check2.setSelected(true);
            check3.setSelected(true);
        } else if (string.equals("  X    X    √  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(true);
        } else if (string.equals("  X    X    X  ")) {
            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
        } else if (string.equals("  √    √    X  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(true);
            check2.setSelected(true);
            check3.setSelected(false);
        } else if (string.equals("  √    X    X  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(true);
            check2.setSelected(false);
            check3.setSelected(false);
        } else if (string.equals("  X    √    X  ")) {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(false);
            check2.setSelected(true);
            check3.setSelected(false);
        } else {
            nr.setSelected(false);
            nr.setEnabled(false);
            check1.setSelected(true);
            check2.setSelected(false);
            check3.setSelected(true);
        }
    }

}
