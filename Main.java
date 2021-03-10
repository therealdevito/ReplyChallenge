import java.io.FileNotFoundException;

public class Main {

    public static int D;
    public static int M;
    public static ArrayList <Developer> developers = new ArrayList();
    public static ArrayList <ProjectManagers> projectManagers = new ArrayList();
    public static int Width;
    public static int Height;
    public static void main(String[] args) {

        try {
            File file = new File("a_example");
            Scanner scanner = new Scanner(file);
            
            String str1 = scanner.nextLine();
            String[] part1 = str.split(" ");
            W = Integer.parseInt(part[0]);
            D = Integer.parseInt(part[1]);

            String[] map;
            for(int i = 0; i < H; i++) {
                String str2 = scanner.nextLine();
                map[i] = str2;
            }

            String str3 = scanner.nextLine();
            D = Integer.parseInt(str3);

            for(int i = 0; i < D; i++) {
                String dev = scanner.nextLine();
                String[] dev1 = str.split();

                String company = dev1[0];
                long bonus = dev1[1];
                int skilsNo = dev1[2];
                
                HashSet <String> skills = new HashSet<>();

                for(int i = 3; i < dev1.length; i++) {
                    skills.add(dev1[i]);
                }

                Developer developer = new Developer(skills, company, bonus);
                developers.add(developer);
            }

            String str4 = scanner.nextLine();
            M = Integer.parseInt(str4);

            for(int i = 0; i < D; i++) {

                String pm = scanner.nextLine();
                String[] pm1 = str.split();

                String company = dev1[0];
                long bonus = dev1[1];

                ProjectManager projectManager = new ProjectManager(company, bonus);
                projectManagers.add(projectManager);

            }

            
        } catch (FileNotFoundException e) {
            System.out.println("Error oppening the file.");
            e.printStackTrace();
        } 

    }

} 
    
