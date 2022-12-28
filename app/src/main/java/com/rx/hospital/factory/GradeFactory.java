package com.rx.hospital.factory;

import com.rx.hospital.model.Bachelor;
import com.rx.hospital.model.DegreeFactory;
import com.rx.hospital.model.Master;
import com.rx.hospital.model.PhD;

public class GradeFactory {
    public DegreeFactory getGrade(String gradeType) {

        if (gradeType.equals("Bachelor")) {
            return new Bachelor();

        } else if (gradeType.equals("PhD")) {
            return new PhD();

        } else if (gradeType.equals("Master")) {
            return new Master();
        }

        return null;
    }
}
