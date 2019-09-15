package 컴포짓패턴;

public class Main {

    public static void main(String[] args) {
        Folder  root = new Folder("root"),
                home = new Folder("home"),
                kang = new Folder("kang"),
                music = new Folder("music"),
                picture = new Folder("picture"),
                doc = new Folder("doc"),
                usr = new Folder("usr");
        File track1 = new File("track1"),
            track2 = new File("track2"),
            pic1 = new File("pic1"),
            pic2 = new File("pic2"),
            doc1 = new File("doc1"),
            java = new File("java");

        root.addComponent(home);
            home.addComponent(kang);
                kang.addComponent(music);
                    music.addComponent(track1);
                    music.addComponent(track2);
                kang.addComponent(picture);
                    picture.addComponent(pic1);
                    picture.addComponent(pic2);
                kang.addComponent(doc);
                    doc.addComponent(doc1);
        root.addComponent(usr);
            usr.addComponent(java);
        show(root);
    }
    private static void show(Component component){
        System.out.println(component.getClass().getName()+ " | "+ component.getName());
        if(component instanceof Folder){
            for(Component c : ((Folder) component).getChildren()){
                show(c);
            }
        }
    }
}
