# MVP_HomeMade_Second_Generation
# MVP自制框架第二代

# [点我预览框架](https://github1s.com/17396743/MVP_HomeMade_Second_Generation)

### 在原有的基础之上进行了更高难度的大改造，添加了背压式，提高网络请求的稳定性，和一些功能封装过的小工具。优化了生命周期，封装了更多的代码，也清除了部分不需要的功能。
#### 在此基础上已添加了默认的mvp配置信息，以供理解，但自己没有添加网络请求的配置信息。注：直接去运行是可以运行的。

#### 此框架，已做成比较简单的模板，可直接下载学习使用。

## 使用：

比如，通过修改或新建的方式在api,interfaces,mode,presenter,ui,utils等包中进行创作。


| 包名          | 详情                                      | 
|   :---:        |              :----:                     |    
| api           | 网络请求配置信息 （就是放网址的地方）        | 
| interfaces   | 接口  （用于数据的传递）                      | 
| mode          | 用于获取网络数据，等其他功能模块  （属于M层） | 
| data          | 用于存放用Gson 解析使用的Bean 类  （属于M层）|
| presenter     | 用于ui与model进行交互用  （属于P层）        | 
| ui            | 用于ui界面制作 (属于V层)                  | 
| utils           | 存放一些小工具                            | 
| MainActivity   | 主界面（属于V层）                        | 
| MyApp         | 小工具专用生命周期                          | 
| base          | 生命周期封装                                | 
| net           | 网络请求封装                                | 



## 注意（大佬就不需要看这里了）：
#### 不必要的话，尽量不要修改以下区域的代码
#### base里面的代码，那片区域已经进行了高难度封装，算是mvp中的核心。
#### net里面的代码，只能改放主域名的那个地方，其他尽量不要改。
#### interfaces里面的代码，尽量不要动Callback,IBasePresenter,IBaseView,IModel里面的代码，这些也经过封装，
#### api里面的ServiceApi文件必须存在！



