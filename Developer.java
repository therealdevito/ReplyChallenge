import java.util.HashSet;
import java.util.stream.Stream;

public class Developer {
    public HashSet<String> skills = new HashSet<>();
    public String company;
    public long bonus;

    public Developer(HashSet<String> skills, String company, long bonus) {
        this.skills = skills;
        this.company = company;
        this.bonus = bonus;
    }

    public long getWP(Developer d) {
        long commonSkills = 0;
        long reunionSkills = 0;
        commonSkills = skills.stream().filter(skill -> {
            return d.skills.contains(skill);
        }).count();
        reunionSkills = Stream.concat(skills.stream(), d.skills.stream()).count();
        return commonSkills * (reunionSkills - commonSkills);
    }

    public long getBP(Developer d) {
        if (company.equals(d.company)) {
            return bonus * d.bonus;
        }
        return 0;
    }

    public long getTotal(Developer d) {
        return getWP(d) + getBP(d);
    }
}
