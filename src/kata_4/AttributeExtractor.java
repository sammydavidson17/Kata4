package kata_4;

public interface AttributeExtractor <Entity, Attribute>{
    
    public Attribute extract(Entity entity);
    
}
