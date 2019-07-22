package command;

/**
 * @author mengxiangtao
 * @date 12/7/2019 下午2:39
 */
public class LightOnCommand implements Command {
    private Light light;
    @Override
    public void excute() {
        light.lightOn();
    }

}
