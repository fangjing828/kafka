package org.apache.kafka.clients.consumer.internals;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.record.Record;
import org.apache.kafka.common.record.RecordBatch;

public interface RecordParser<K, V> {
    ConsumerRecord<K, V> parseRecord(TopicPartition partition,
                                     RecordBatch batch,
                                     Record record);
}
