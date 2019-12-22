package protocol;

import lombok.Data;

/**
 * @author luffy
 **/
@Data
public abstract class Packet {

    private Byte version = 1;

    /**
     * 返回指令
     * @return Byte
     */
    public abstract Byte getCommand();


}
