-- Last updated: 7/9/2026, 3:08:48 PM
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;