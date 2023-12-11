public class Sprites {
    int height;
    int breadth;
    int [][]body;

    Sprites(int height, int breadth){
        this.height = height;
        this.breadth = breadth;
        body = new int[height][breadth];
    }
}
