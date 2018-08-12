package pl.mpas.crud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mpas.crud.dao.StudentDao;
import pl.mpas.crud.domain.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private static Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAllStudents() {
        logger.debug("findAllStudents()");
        return (List<Student>) studentDao.findAll();
    }
}
