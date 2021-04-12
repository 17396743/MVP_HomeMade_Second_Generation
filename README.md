# MVP_HomeMade_Second_Generation
MVP自制框架第二代

### 在原有的基础之上进行了更高难度的大改造，添加了背压式和一些小工具，优化了生命周期，封装了更多的代码。
#### 在此基础上已添加了默认的mvp配置信息，以供理解，但自己没有添加网络请求的配置信息。所以直接去运行是无法运行的。

#### 此框架，已做成模板，可直接下载使用。

## 使用：
请通过修改或新建的方式
api,interfaces,mode,presenter,ui,utils中进行创作。

|包名|详情|
| Syntax      | Description | Test Text     |
| :---        |    :----:   |          ---: |
| Header      | Title       | Here's this   |
| Paragraph   | Text        | And more      |


```
api ``` 网络请求配置信息
interfaces ``` 接口
mode ``` 用于获取网络数据，等其他功能模块
presenter ``` 用于ui与model进行交互用
```
ui：用于ui界面制作
utils：存放一些小工具

MainActivity：主界面
MyApp：小工具专用生命周期

## 注意：
### 不必要的话，尽量不要修改base,net里面的代码，因为那片区域已经进行了高难度封装，算是mvp中的核心。
