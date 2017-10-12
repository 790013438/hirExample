## org.eclipse.persistence.exceptions.ValidationException

```java
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Person implements Serializable {...}

@Entity(name="tb_husband")
public class Husband extends Person {
```

* 把抽象类（@Entity标注的super class）也加入persistence.xml,Managed Classes管理