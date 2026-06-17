# Write your MySQL query statement below
select Round(count(distinct player_id)/(select count( Distinct player_id) from activity),2) as fraction
from activity
where(player_id, Date_sub(event_date, Interval 1 day)) in (
    select player_id, min(event_date) from activity group by player_id
)