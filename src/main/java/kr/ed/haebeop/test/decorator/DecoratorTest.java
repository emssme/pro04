package kr.ed.haebeop.test.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw(); //기본 도로 표시

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw(); //기본 도로표시 + 차선 표시

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw(); //기본 도로 표시 + 교통량 표시

        Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneAndTraffic.draw();  //기본 도로 표시 + 차선 표시 + 교통량 표시
    }
}
