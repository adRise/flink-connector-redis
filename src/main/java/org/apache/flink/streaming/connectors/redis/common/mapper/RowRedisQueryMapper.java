package org.apache.flink.streaming.connectors.redis.common.mapper;

/** row redis mapper. @Author: jeff.zou @Date: 2022/3/7.14:59 */
public class RowRedisQueryMapper<OUT> implements RedisMapper<OUT> {

    RedisCommand redisCommand;

    public RowRedisQueryMapper(RedisCommand redisCommand) {
        this.redisCommand = redisCommand;
    }

    public RedisCommand getRedisCommand() {
        return redisCommand;
    }

    @Override
    public RedisCommandBaseDescription getCommandDescription() {
        return new RedisCommandBaseDescription(redisCommand);
    }
}
