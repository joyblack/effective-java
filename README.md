# Getting Started

## Reference Documentation
This is show the effective java learn progress.

## Guides
c_num show the how many chapter.

## Index
### C1、创建和销毁对象
#### 1、用静态工厂方法代替构造器
#### 2、遇到多个构造器参数时，要考虑使用构建器
#### 3、用私有构造器或者枚举类型强化Singleton属性
#### 4、通过私有构造器强化不可实例化的能力
#### 5、优先考虑使用依赖注入来引用资源
#### 6、避免创建不必要的对象
#### 7、消除过期对象的引用
#### 8、避免使用终结方法和清除方法
#### 9、try-with-resource 优先于 try-finally

### C2、对象通用方法
#### 10、覆盖equals方法时，请遵守通用约定
#### 11、覆盖equals方法时，也要记得覆盖hashCode方法
* 其实只要该类如果作为散列集合的key而存在，那也有必要将其的hashCode进行重写，否则同样无法准确定位值相等的对象；
#### 12、始终覆盖toString
#### 13、谨慎的覆盖clone
* Object的clone方法其实是受保护的，不可使用；要实现复制功能，通过实现接口Cloneable实现；
* 不可变类不要实现clone方法，因为他只会激发不必要的克隆；
* 总结：赋值功能最好有构造器或者工厂提供，而不要使用Cloneable,但对于数组的拷贝，clone方法复制是不错的方式。

#### 14、考虑实现Comparable接口
* 需要注意的是compareTo方法并不是在Object中定义的，相反，是Comparable接口提供的（这个接口也只有这一个方法）；
* 类实现了Comparable接口，表明他具有内在的排序关系，同时，该类也支持很多排序API的调用：`Arrays.sort(a)`;甚至可以使用许多泛型算法，依赖于该接口的结合实现。因此，推荐实现该接口，一个小小的实现就可以使用大量的功能；
* 将这个对象与指定的对象进行比较：
    * 小于：返回负整数；
    * 等于：返回0；
    * 大于：返回正整数。
* Java8通过配置Comparator接口形成一组比较器构造方法，使得比较器的工作变得非常流畅。按照该构造器的要求，可以实现一个compareTo方法；
* 比较方法中，要避免使用大于小于符号，应该在装箱基本类型中使用静态的compare方法（如上一条所说，jdk已经添加了这些方法）；    