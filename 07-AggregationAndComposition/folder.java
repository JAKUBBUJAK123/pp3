import java.util.ArrayList;

public class folder {
    String name;
    int size;
    String path;
    ArrayList<file> files = new ArrayList<>();
    public folder(String name, int size, String path){
        this.name = name;
        this.path = path;
        this.size = size;
    }
    public void addFile(file f){
        files.add(f);
    }
    public void removeFile(String name){
        for (int i = 0; i < files.size(); i++) {
            if (this.files.get(i).getName() == name){
                this.files.remove(i);
            }
        }
    }
    public void display(){
        for (int i = 0; i < this.files.size(); i++) {
            System.out.println(this.files.get(i).getName() + " " + this.files.get(i).getSize());
        }
    }
    public static void main(String[] args) {
        file file1 = new file(20, "Sciągi na niemiecki");
        file file2 = new file(100, "Dziecięca pornografia");
        file file3 = new file(10, "Przepis na szrlotkę");
        folder myFolder = new folder("Mój folder", 300, "C/JakubBujak");
        myFolder.addFile(file1);
        myFolder.addFile(file2);
        myFolder.display();
        myFolder.addFile(file3);
        myFolder.removeFile("Dziecięca pornografia");
        myFolder.display();
    }
}
