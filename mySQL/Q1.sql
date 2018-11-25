SELECT rr.start_date, rr.end_date,rr.veh_reg_no,vh.brand,cs.name
FROM rental_records AS rr
INNER JOIN vehicles AS vh  ON rr.veh_reg_no=vh.veh_reg_no
INNER JOIN customers AS cs  ON rr.customer_id=cs.customer_id
ORDER BY cs.name desc;


