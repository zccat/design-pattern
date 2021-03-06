# 迭代器模式

## 一、模式定义
何谓迭代器模式？所谓迭代器模式就是提供一种方法顺序访问一个聚合对象中的各个元素，而不是暴露其内部的表示。在实际的开发过程中，我们可能需要针对不同的需求，可能需要以不同的方式来遍历整个整合对象，但是我们不希望在聚合对象的抽象接口层中充斥着各种不同的便利操作。这个时候我们就需要这样一种东西，它应该具备如下三个功能：

1. 能够便利一个聚合对象。

2. 我们不需要了解聚合对象的内部结构。

3. 能够提供多种不同的遍历方式。

这三个功能就是迭代器模式需要解决的问题。作为一个功能强大的模式，迭代器模式把在元素之间游走的责任交给迭代器，而不是聚合对象。这样做就简化了聚合的接口和实现，也可以让聚合更专注在它所应该专注的事情上，这样做就更加符合单一责任原则。

## 二、模式结构

迭代器模式有如下几个角色：

* Iterator: 抽象迭代器：所有迭代器都需要实现的接口，提供了游走聚合对象元素之间的方法。

* ConcreteIterator: 具体迭代器。利用这个具体的迭代器能够对具体的聚合对象进行遍历。每一个聚合对象都应该对应一个具体的迭代器。

* Aggregate: 抽象聚合类。

* ConcreteAggregate: 具体聚合类。实现creatorIterator()方法，返回该聚合对象的迭代器。

## 四、模式优缺点
### 优点
1. 它支持以不同的方式遍历一个聚合对象。

2. 迭代器简化了聚合类。

3. 在同一个聚合上可以有多个遍历。

4. 在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。

### 缺点

* 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。

### 五、模式使用场景
1. 访问一个聚合对象的内容而无须暴露它的内部表示。

2. 需要为聚合对象提供多种遍历方式。

3. 为遍历不同的聚合结构提供一个统一的接口。

### 六、模式总结
1. 迭代器模式提供一种方法来访问聚合对象，而不用暴露这个对象的内部表示。

2. 将遍历聚合对象中数据的行为提取出来，封装到一个迭代器中，通过专门的迭代器来遍历聚合对象的内部数据，这就是迭代器模式的本质。迭代器模式是“单一职责原则”的完美体现。

3. 当使用迭代器的时候，我们依赖聚合提供遍历。

4. 迭代器提供了一个通用的接口，让我们遍历聚合的项，放我们编码使用聚合项时，就可以使用多态机制。