package warburton.fourChapter;

import warburton.dataForChaptersExers.Artist;

import java.util.stream.Stream;

/**
 * @author Artem Karnov @date 01.02.2017.
 *         artem.karnov@t-systems.com
 */

interface Performance {
    public String getName();

    public Stream<Artist> getMusicians();
}