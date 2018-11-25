SELECT rr.veh_reg_no,vh.brand,vh.desc,rr.start_date,rr.end_date
 FROM rental_records AS rr
 INNER JOIN vehicles as vh ON rr.veh_reg_no=vh.veh_reg_no
WHERE '2012-01-10' NOT BETWEEN rr.start_date AND rr.end_date;