public class PlotterRenderer implements Renderer {
    @Override
    public void render(String shapeName) {
        System.out.println("Отрисовка " + shapeName + " на плоттере.");
    }
}