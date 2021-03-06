package xjh.rpc.transport.protocol;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import xjh.rpc.transport.codec.Packet;

/**
 * @Author XJH
 * @Date 2020/11/07
 * @Description 方法调用结果响应
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Response extends Packet {
    int code;
    long requestId;
    String message;
    Object object;

    @Override
    public Class<? extends Packet> getClazz() {
        return Response.class;
    }
}
