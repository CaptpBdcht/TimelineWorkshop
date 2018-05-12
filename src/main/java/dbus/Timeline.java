package dbus;

import java.util.Date;
import java.util.List;

/**
 * This abstraction represents a timeline in the sense of it is
 * a container containing ordered date instances
 *
 * Class invariants that should be respected concern only the getDates method
 *  -   production-wise the getDates method is called many times, therefore,
 *      it should not perform any cpu intensive task, such as sorting
 *  -   the returned list should always be ordered
 *  -   the returned list should always contains at least two elements
 *
 * @param <E> a java.util.Date or an extension of it
 */
public interface Timeline<E extends Date> {

    /**
     * retrieve the dates contained in the Timeline container
     *
     * for more information, see class invariants
     *
     * @return the contained dates
     */
    List<E> getDates();

    /**
     * add the given date to the container
     *
     * if the date is already in the timeline, nothing is added
     *
     * @param date the date to add.
     */
    void add(E date);
}