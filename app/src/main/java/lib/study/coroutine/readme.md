
### 协程

**线程是由系统去控制调度的，所以线程使用起来比较难于控制,kotlin协程是运行在线程之上的，
它的切换由程序自己来控制，无论是 CPU 的消耗还是内存的消耗都大大降低.**

**kotlin协程的三种启动方式:**

- runBlocking:T

        方法用于启动一个协程任务,他会阻塞主线程，协程任务执行完毕以后，才会去执行主线程

- launch:Job

        方法用于启动一个协程任务,他不会阻塞主线程

- async/await:Deferred

        1.async和await是两个函数，这两个函数在我们使用过程中一般都是成对出现的。

        2.async用于启动一个异步的协程任务，await用于去得到协程任务结束时返回的结果，结果是通过一个Deferred对象返回的。

[协程具体的文档在这](https://github.com/Kotlin/kotlinx.coroutines/blob/master/coroutines-guide.md)