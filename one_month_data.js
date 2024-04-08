$('#fromDate').datepicker({
    changeMonth: true,
    changeYear: true,
    dateFormat: 'yy-mm-dd',
    onSelect: function(selectedDate) {
        var maxDate = new Date(selectedDate);
        maxDate.setMonth(maxDate.getMonth() - 1);
        $('#toDate').datepicker('option',  "maxDate", maxDate);
    }
});
$('#toDate').datepicker({
    dateFormat: 'yy-mm-dd',
    beforeShow: function(input, inst) {
        var datepicker = inst.dpDiv;
        setTimeout(function() {
            datepicker.find('.ui-datepicker-prev, .ui-datepicker-next').hide();
        }, 0);
    },
    beforeShowDay: function(date) {
        return [true,''];
    },
    onSelect: function(selectedDate) {
        var minDate = new Date(selectedDate);
        minDate.setMonth(minDate.getMonth());

        // Set maxDate for fromDate
        $('#fromDate').datepicker('option', 'setDate', minDate);
    }
});