package com.chezhibao.bigdata.zipkin.dubbo.dubbo;

import com.alibaba.dubbo.rpc.RpcContext;

/**
 * Created by chenjg on 16/8/22.
 */
public interface DubboServerNameProvider {
    public String resolveServerName(RpcContext rpcContext);
}
