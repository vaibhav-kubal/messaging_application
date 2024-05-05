package com.redis.msg.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RedisReciever {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedisReciever.class);

    @Override
    public void onMessage(Message message, byte[] pattern) {
        // TODO Auto-generated method stub
        LOGGER.info("Received data - " + message.toString() + " from Topic - " + new String(pattern));
    }

}
