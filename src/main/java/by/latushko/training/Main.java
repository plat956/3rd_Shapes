package by.latushko.training;

import by.latushko.training.entity.Rectangle;
import by.latushko.training.exception.InputFileReadException;
import by.latushko.training.exception.RectangleParseException;
import by.latushko.training.factory.ShapeFactory;
import by.latushko.training.observer.RectangleObserver;
import by.latushko.training.observer.impl.RectangleObserverImpl;
import by.latushko.training.parser.RectangleParametersParser;
import by.latushko.training.parser.impl.RectangleParametersParserImpl;
import by.latushko.training.reader.DataReader;
import by.latushko.training.reader.impl.DataReaderImpl;
import by.latushko.training.repository.RectangleRepository;
import by.latushko.training.repository.impl.IdSpecification;
import by.latushko.training.util.Pair;
import by.latushko.training.warehouse.RectangleWarehouse;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InputFileReadException, RectangleParseException {
        DataReader dataReader = new DataReaderImpl();
        List<String> qwe = dataReader.readLines("data/input.txt");

        RectangleParametersParser parametersParser = new RectangleParametersParserImpl();
        for(String s: qwe) {
            Pair<Integer[], Double[]> data = parametersParser.parseParameters(s);
            Rectangle rectangle = ShapeFactory.createRectangle(data);

            RectangleWarehouse rectangleWarehouse = RectangleWarehouse.getInstance();
            rectangleWarehouse.putProperties(rectangle.getRectangleId(), 10, 10);

            RectangleObserver observer = new RectangleObserverImpl();
            rectangle.attach(observer);

            rectangle.setHeight(5);
            rectangle.setWidth(20);

            RectangleRepository repository = RectangleRepository.getInstance();
            IdSpecification specification = new IdSpecification(rectangle.getRectangleId());

            List<Rectangle> rectangles = repository.query(o -> specification.specify(o));

            data = null;
        }
    }
}
