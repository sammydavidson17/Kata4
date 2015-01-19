package kata_4;

public class HistogramBuilder<E> {
    
    private E[] items;

    public HistogramBuilder(E[] items) {
        this.items = items;
    }
    
    public <A> Histogram<A> build(AttributeExtractor<E,A> extractor){
        Histogram histogram = new Histogram<>();
        for (E item : items) {
            A attribute = extractor.extract(item);
            histogram.put(attribute, histogram.get(attribute) + 1);
        }
        return histogram;
    }   

}

