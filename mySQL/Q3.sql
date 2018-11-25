SELECT rr.veh_reg_no,vh.brand,vh.desc,rr.start_date,rr.end_date
 FROM rental_records AS rr
 INNER JOIN vehicles as vh ON rr.veh_reg_no=vh.veh_reg_no
WHERE (rr.start_date BETWEEN '2012-01-03' AND '2012-01-18' OR 
		rr.end_date Between '2012-01-03' AND '2012-01-18' OR
       ( rr.start_date<'2012-01-03' AND rr.end_date>'2012-01-18'));