package com.example.guoxw.myapplication.interfaces.listeners

import com.example.guoxw.myapplication.bean.events.WalkEvent

/**
 * Created by guoxw on 2017/7/26 0026.
 * @auther guoxw
 * @date 2017/7/26 0026
 * @desciption
 * @package com.example.guoxw.myapplication
 */
interface WalkListenerInterface<T> {

    fun walkOntheWay(walkEvent: WalkEvent<T>)

}