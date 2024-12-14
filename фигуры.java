public class фигуры {
        public static void main(String[] args) {

            List<FigureInterface> figures = new ArrayList<FigureInterface>();
            figures.add(new Square(2));
            figures.add(new Square(3));
            figures.add(new Triangle(2, 2, 3));
            figures.add(new Triangle(3, 4, 5));
            figures.add(new Circle(2));
            figures.add(new Circle(4));
            Collections.sort(figures, new FigureComparator());
            for (FigureInterface f : figures) {
                System.out.println(f.toString());
            }
        }

        interface FigureInterface {
            public float area();

            public float perimetr();
        }

        static class Square implements FigureInterface {

            @Override
            public float area() {
                return a * a;
            }

            @Override
            public float perimetr() {
                return 4 * a;
            }

            @Override
            public String toString() {

                String info = name;
                info += " perimetr:" + perimetr();
                info += " area:" + area();
                info += "\n";
                return info;
            }

            public Square(float a) {
                this.a = a;
            }

            private float a;
            private final String name = "Square";

        }

        static class Triangle implements FigureInterface {

            @Override
            public float area() {
                float p = perimetr() / 2;
                return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            }

            @Override
            public float perimetr() {
                return a + b + c;
            }

            @Override
            public String toString() {

                String info = name;
                info += " perimetr:" + perimetr();
                info += " area:" + area();
                info += "\n";
                return info;
            }

            public Triangle(float a, float b, float c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            private float a, b, c;
            private final String name = "Triangle";

        }

        static class Circle implements FigureInterface {

            @Override
            public float area() {
                return (float) (Math.PI * r * r);
            }

            @Override
            public float perimetr() {
                return (float) (2 * Math.PI * r);
            }

            @Override
            public String toString() {

                String info = name;
                info += " perimetr:" + perimetr();
                info += " area:" + area();
                info += "\n";
                return info;
            }

            public Circle(float r) {
                this.r = r;
            }

            private float r;
            private final String name = "Circle";
        }

        static class FigureComparator implements Comparator<FigureInterface> {

            @Override
            public int compare(FigureInterface o1, FigureInterface o2) {
                return (int) (o1.area() - o2.area());
            }

        }

    }
}
