# design-pattern
## 设计模式笔记


### 构建者设计模式：builder-pattern

#### 思想：
    分步骤的构建复杂对象，隔离负责对象的创建和使用

#### 步骤：
    定义需要使用构建者模式的类。
    定义构建者接口。
    定义构建者工厂实现构建者接口。

### 责任链设计模式：responsibility-chain

#### 思想：
    使多个对象有机会处理同一请求，避免请求的发送者和接收者之间的耦合。

#### 步骤：
    定义抽象责任链接口。
    定义某一请求的责任链过滤器接口。
    实现具体请求的责任链过滤器接口。
    定义责任链工厂。


### 策略设计模式：strategy-pattern

#### 思想：
    将每个算法封装起来，使它们可以互相替换，使程序可以动态更改策略对象

#### 步骤：
    定义抽象策略接口。
    定义具体策略实现类。
    定义策略工厂。