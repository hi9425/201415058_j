
public class Rectangle {
    private int width;
    private int height;


    public void setSize(int edit_width,int edit_height){

        this.height=edit_height;
        this.width=edit_width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height= height;
    }



    int calcArea()
    {
        int Area= width*height;

        return Area;
    }


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(9,8);

        System.out.println("�簢���� ���̴� "+rectangle.calcArea()+"cm �Դϴ�");

        rectangle.setSize(33,20);

        System.out.println("������ �簢���� ���̴� "+rectangle.calcArea()+"cm �Դϴ�");

    }

}

