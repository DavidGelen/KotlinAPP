package lib.study.coroutine

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * @name KotlinAPP
 * @package name：lib.study.coroutine
 * @anthor DavidZhang
 * @time 2019/1/11 15:31
 * @class describe
 */
class Test {

    /**runBlocking函数会阻塞当前线程，一直等到协程运行完*/
    fun main(args: Array<String>) = test6()

    /**协程取消*/
    private fun test6() {
        runBlocking<Unit> {
            val job = launch {
                repeat(1000) { i ->
                    println("I'm sleeping $i ...")
                    delay(500L)
                }
            }
            delay(1300L) // delay a bit
            println("main: I'm tired of waiting!")
            job.cancelAndJoin()
            println("main: Now I can quit.")
        }
    }

    private fun test5() {
        runBlocking<Unit> {
            launch {
                repeat(1000) { i ->
                    println("I'm sleeping $i ...")
                    delay(500L)
                }
            }
            delay(1300L) // just quit after delay 等待1.3秒后，main退出了。不会等待launch的协程运行完
        }
    }

    /**协程是非常轻量级的,启动了10万个协程，最后代码能够成功的执行完成。同样，大家可以试试换成起10万个线程试试，应该会得出OOM的结果。*/
    private fun test4() {
        runBlocking<Unit> {
            val jobs = List(100_000) {
                // launch a lot of coroutines and list their jobs
                launch {
                    delay(1000L)
                    print(".")
                }
            }
            jobs.forEach { it.join() } // wait for all jobs to complete
        }
    }

    private fun test3() {
        runBlocking<Unit> {
            val job = launch { doWorld() }
            println("Hello,")
            job.join()
        }
    }

    // this is your first suspending function
    suspend fun doWorld() {
        delay(1000L)
        println("World!")
    }

    /**通过join来实现一旦协程完成就退出main函数。*/
    private fun test2() {
        runBlocking<Unit> {
            val job = launch {
                // launch new coroutine and keep a reference to its Job
                delay(1000L)
                println("World!")
            }
            println("Hello,")
            job.join() // wait until child coroutine completes
        }
    }

    /**延长一段时间等待协程完成*/
    private fun test1() {
        runBlocking<Unit> {
            // start main coroutine
            launch {
                // launch new coroutine in background and continue
                delay(1000L)
                println("World!")
            }
            println("Hello,") // main coroutine continues here immediately
            delay(2000L)      // delaying for 2 seconds to keep JVM alive
        }
    }

}