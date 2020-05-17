/* Licensed under Apache-2.0 */
package io.terrible.app.batch.writers;

import io.terrible.app.domain.MediaFile;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;

/** If you've ever seen a hammer, this is the biggest one you could possibly imagine. */
@Component
@RequiredArgsConstructor
public class MongoReactiveWriter<T> implements ItemWriter<MediaFile> {

  private final ReactiveMongoTemplate reactiveMongoTemplate;

  @Override
  public void write(List<? extends MediaFile> mediaFiles) {
    mediaFiles.forEach(mediaFile -> reactiveMongoTemplate.save(mediaFile).subscribe());
  }
}