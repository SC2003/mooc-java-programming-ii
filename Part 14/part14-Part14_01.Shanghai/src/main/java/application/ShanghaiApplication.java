package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage window) {

        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);

        chart.setTitle("University of Helsinki, Shanghai ranking");
        chart.setLegendVisible(false);

        //Two ways to add data, testing both
        //1
        XYChart.Series uniData1 = new XYChart.Series();

        int year = 2007;
        uniData1.getData().add(new XYChart.Data(year, 73));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 68));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 72));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 72));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 74));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 73));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 76));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 73));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 67));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 56));

        year++;
        uniData1.getData().add(new XYChart.Data(year, 56));

        //
        //2
        //
        XYChart.Series uniData2 = new XYChart.Series();

        Map<Integer, Integer> data = new HashMap<>();

        data.put(2007, 73);
        data.put(2008, 68);
        data.put(2009, 72);
        data.put(2010, 72);
        data.put(2011, 74);
        data.put(2012, 73);
        data.put(2013, 76);
        data.put(2014, 73);
        data.put(2015, 67);
        data.put(2016, 56);
        data.put(2017, 56);

        data.entrySet().stream().forEach(pair -> {

            uniData2.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));

        });
        //Adding data to the chart
        //use only one of these
        //
        //chart.getData().add(uniData1);
        chart.getData().add(uniData2);
        //
        //
        //
        //600x300
        //Scene view = new Scene(chart, 600, 300);
        //640x480
        Scene view = new Scene(chart, 640, 480);

        window.setScene(view);
        window.setTitle("Uni Rank");
        window.show();

    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
