public class Hello {



        private String name;
        public Hello(String name)
        {
            this.name=name;
        }
        public void sayHello()
        {
            System.out.println("hello"+name);
        }


    public static void main(String[] args) {
        Hello[] h=new Hello[5];
        h[0]=new Hello("승훈");
        h[1]=new Hello("기준");
        h[2]=new Hello("차홍");
        h[3]=new Hello("옥상");

        for (int i=0; i<h.length; i++)
        {
            h[i].sayHello();
        }
    }

}
