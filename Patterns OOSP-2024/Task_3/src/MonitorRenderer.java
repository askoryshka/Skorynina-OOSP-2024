public class MonitorRenderer implements Renderer {
    @Override
    public void render(String shapeName) {
        System.out.println("Отображение " + shapeName + " на мониторе.");
    }
}