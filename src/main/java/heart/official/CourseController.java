package heart.official;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class CourseController {
    @Autowired
    private CourseService courseManagementService;

    @GetMapping("/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseManagementService.findAll();
    }

    @DeleteMapping("/{username}/courses/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String username, @PathVariable long id) {

        Course course = courseManagementService.deleteById(id);

        if (course != null) {
//            If Request is successful, return no content back
            return ResponseEntity.noContent().build();
        }
//        If delete failed, return error - resource not found.
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{username}/courses/{id}")
    public Course getCourse(@PathVariable String username, @PathVariable long id) {
        return courseManagementService.findById(id);
    }


}
