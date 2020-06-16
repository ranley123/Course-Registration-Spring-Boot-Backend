package heart.official;

import java.util.Objects;

public class Course {
    private long id;
    private String username;
    private String description;

    public long getId(){
        return id;
    }

    public String getUsername(){return username;}

    public String getDescription(){return description;}

    public void setId(long id){this.id = id;}

    public void setUsername(String username){this.username = username;}

    public void setDescription(String description){this.description = description;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Course(long id, String username, String description){
        this.id = id;
        this.username = username;
        this.description = description;
    }


}
