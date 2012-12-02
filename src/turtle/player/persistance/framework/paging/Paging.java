package turtle.player.persistance.framework.paging;

import turtle.player.persistance.framework.filter.*;
import turtle.player.persistance.framework.sort.*;

/**
 * TURTLE PLAYER
 * <p/>
 * Licensed under MIT & GPL
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 * <p/>
 * More Information @ www.turtle-player.co.uk
 *
 * @author Simon Honegger (Hoene84)
 */

public abstract class Paging
{

	public static <I, W, Q> Filter<W> getFilter(Filter<W> oldFilters,
										I instance,
										Order<Q> order)
	{
		if(instance != null)
		{
			return new FilterSet<W>(order.accept(new PagingFilterBuilder<I, W, Q>(instance)), oldFilters);
		}
		else
		{
			return oldFilters;
		}
	}
}
