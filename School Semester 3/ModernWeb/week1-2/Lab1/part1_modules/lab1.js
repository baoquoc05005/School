const _ = require('lodash');

//  list of holiday objects
const holidays = [
    { name: 'Christmas', date: '2025-12-25' },
    { name: 'Canada Day', date: '2025-07-01' },
    { name: 'New Years', date: '2025-01-01' },
    { name: 'Thanksgiving', date: '2025-10-13' },
    { name: 'Halloween', date: '2025-10-31' },
    { name: 'Victoria Day', date: '2025-05-19' }
];

// calculate days until holiday
function getDaysUntil(dateStr) {
    const holiday = new Date(dateStr);
    const today = new Date();
    const diffTime = holiday - today;
    const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
    return diffDays;
}

// iterate and print days until each holiday
console.log('Days until each holiday:');
holidays.forEach(holiday => {
    const daysUntil = getDaysUntil(holiday.date);
    console.log(`${holiday.name}: ${daysUntil} days`);
});

// random holiday using lodash
const randomHoliday = _.sample(holidays);
console.log('\nRandom holiday:', randomHoliday.name, 'on', randomHoliday.date);

// indexes of specific holidays using lodash
const christmasIndex = _.findIndex(holidays, { name: 'Christmas' });
const canadaDayIndex = _.findIndex(holidays, { name: 'Canada Day' });

console.log('\nIndexes:');
console.log('Christmas index:', christmasIndex);
console.log('Canada Day index:', canadaDayIndex);