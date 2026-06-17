# Write your MySQL query statement below

select ROUND(
    COUNT(DISTINCT player_id) / (select COUNT(DISTINCT player_id)
    from activity),2) AS fraction
from activity
where (player_id, DATE_SUB(event_date, INTERVAL 1 day)) IN(
    select player_id, min(event_date) as first_login
    from activity
    group by player_id
)

